package web.chat.dao.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import web.chat.util.JedisPoolUtil;

public class JedisMessageDAO {

	private static JedisPool pool = JedisPoolUtil.getJedisPool();

	public static List<String> getHistoryMsg(String sender, String receiver) {
		String key = new StringBuilder(sender).append(":").append(receiver).toString();
		Jedis jedis = null;
		jedis = pool.getResource();
		List<String> historyData = jedis.lrange(key, 0, -1);
		jedis.close();
		return historyData;
	}

	public static void saveChatMessage(String sender, String receiver, String message) {
		String senderKey = new StringBuilder(sender).append(":").append(receiver).toString();
		String receiverKey = new StringBuilder(receiver).append(":").append(sender).toString();
		Jedis jedis = pool.getResource();
		jedis.rpush(senderKey, message);
		jedis.rpush(receiverKey, message);
		jedis.close();
	}

	public static Set<String> getChatList(String userName) {
		Jedis jedis = pool.getResource();
		Set<String> keys = jedis.keys(userName + "*");
		Set<String> userNames = new HashSet<>();
		for (String s : keys) {
			String[] result = s.split(":");
			userNames.add(result[1]);
		}
		jedis.close();
		return userNames;
	}
}
