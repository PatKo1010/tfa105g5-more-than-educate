// http://localhost:7080/tfa105g5-more-than-educate/views/teacher/teacherSchedule.html
$(function () {
    fetch("./teacher/reservedTime", {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            memid: 11
        })
    }).then(response => response.json())
        .then((data) => {
            console.log(data);
            let options = {
                dayBegin: 0,
                prevIcon: '&#x3c;',
                nextIcon: '&#x3e;',
                onPrevMonth: function (e) {
                    console.log("prev");
                    console.log(e)
                },
                onNextMonth: function (e) {
                    console.log("next");
                    console.log(e)
                },
                events: []
            }
            if (data.length !== 0) {
                for (let i = 0; i < data.length; i++) {
                    console.log(data[i]);
                    const orderId = data[i].orderId;

                    const reservId = data[i].reservTimeId;
                    const reservTimeStart = data[i].reservDateStart;
                    const reservTimeEnd = data[i].reservDateEnd;

                    const tId = data[i].tId;
                    const tName = data[i].tName;
                    const sName = data[i].sName;

                    const courseId = data[i].courseId;
                    const courseRank = data[i].courseRank;
                    const courseTitle = data[i].courseTitle;

                    const isReserved = data[i].isReserved;

                    if (isReserved === true) {
                        options.events.push(
                            {
                                date: new Date(reservTimeStart),
                                startTime: new Date(reservTimeStart),
                                endTime: new Date(reservTimeEnd),
                                eventName: `${sName}:${courseTitle} 第${courseRank}堂`,
                                className: "badge bg-success",
                                onclick(e, data) {
                                    alert(
                                        `學生:${sName},
                                         課程: ${courseTitle}
                                         堂數:第${courseRank}堂
                                         開始時間:${new Date(reservTimeStart)}
                                         結束時間:${new Date(reservTimeEnd)}`
                                    )
                                },
                                dateColor: "green"
                            })
                    }
                }
            } else {
                options.events.push(
                    {
                        date: new Date(),
                        eventName: `目前沒有任何課程`,
                        className: "badge bg-success",
                        onclick(e, data) {
                            console.log(data)
                        },
                        dateColor: "green"
                    })
            }
            let calendar = $("#calendar").calendarGC(options);
        })
})














