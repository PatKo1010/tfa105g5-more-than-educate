package web.certificate.dao;

import java.util.List;

import web.certificate.entity.CertificateBean;

public interface CertificateDAOInterface {

	//1.新增
	public abstract CertificateBean insert(CertificateBean certificateBean);
	
	//2.刪除
	public abstract boolean delete(Integer certid);
	
	//3.修改
	public abstract CertificateBean update(Integer certid, Integer teaid, byte[] certphoto);
	
	//4a.查詢(單)
	public abstract CertificateBean select(Integer certid);
	
	//4b.查詢(多)
	public abstract List<CertificateBean> select();
}
