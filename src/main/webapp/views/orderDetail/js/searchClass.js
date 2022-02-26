const reserv = document.querySelector(".reserv_button")

fetch(`http://localhost:7080/tfa105g5-more-than-educate/OrderDetail/selectCourse`, {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json'
    },
    body: JSON.stringify({
        studentId: 10
    })
})
    .then(response => response.json())
    .then((data) => {
        console.log(data);
        let elTable = document.querySelector(".el-table");
        if (data.length != 0) {
            for (let i = 0; i < data.length; i++) {
                const orderID = data[i].orderID;
                const courseIntro = data[i].courseIntro;
                const courseTitle = data[i].courseTitle;
                const tName = data[i].tName;
                const sName = data[i].sName;
                const price = data[i].price;

                elTable.innerHTML += `
                <table id="t${orderID}" class="display" style="margin-bottom:30px">
                    <thead>
                        <tr>
                            <th></th>
                            <th >Teacher</th>
                            <th>Course Title</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td><button id="b${orderID}" class="reserv_button" onclick="read(event)">查詢預約時間</button></td>
                            <td>
                                <span class="name">${tName}</span>
                            </td>
                            <td class="custom-hide">
                                <div class="teacher">
                                    <a href="page-teacher.html">
                                        <span class="text">${courseTitle}</span>
                                    </a>
                                </div>
                            </td>
                        </tr>
                    </tbody>
                </table>
                <div id="r${orderID}"></div>`
            }
        }
    });

function read(e) {
    const seq = e.target.id.substring(1);
    const table = document.querySelector(`#t${seq}`);
    const reservSection = document.querySelector(`#r${seq}`)
    const modalWrapper = document.querySelector(`#modal-wrapper`)
    fetch(`http://localhost:7080/tfa105g5-more-than-educate/reserv/selectByOrderID`, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            orderID: seq
        })
    })
        .then(response => response.json())
        .then((data) => {
            console.log(data)
            reservSection.innerHTML = ""
            modalWrapper.innerHTML = ""
            if (data.length != 0) {
                for (let i = 0; i < data.length; i++) {
                    let options = {
                        year: 'numeric',   //(e.g., 2019)
                        month: '2-digit',    //(e.g., Oct)
                        day: 'numeric',    //(e.g., 1)
                        hour: '2-digit',   //(e.g., 02)
                        minute: '2-digit', //(e.g., 02)          
                        hour12: false   // 24 小時制
                    };

                    console.log(data[i])
                    const reservID = data[i].reservID;
                    const orderID = data[i].orderID;
                    const isReserved = data[i].isReserved;
                    const reservDateStart = data[i].reservDateStart
                    const reservDateEnd = data[i].reservDateEnd;

                    const startTime = new Date(reservDateStart).toLocaleDateString("en-TW", options).split(",");
                    const endTime = new Date(reservDateEnd).toLocaleDateString("en-TW", options).split(",");

                    const startYear = startTime[1];
                    const startMonthDay = startTime[0];
                    const startHourMin = startTime[2]
                    const endHourMin = endTime[2];

                    if (isReserved === false) {
                        reservSection.innerHTML +=
                            `<ul id='reservSection${reservID}' style="display:flex; justify-content:space-between;"> 
                                    <li>
                                        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal${reservID}">
                                            預約
                                        </button>
                                    </li>
                                    <li>
                                        <p>尚未預定</p>
                                    </li>
                                    <li>
                                        第${i + 1}堂
                                    </li>
                                </ul>`

                        const nowDateTimeStamp = Date.now();
                        const nowDate = new Date(nowDateTimeStamp);
                        const nowDateString = nowDate.toLocaleDateString("en-TW", options)
                        const nowYearMonthDay = (nowDateString.split(","))[0].split("/")
                        const nowHourMin = (nowDateString.split(","))[1].split(":")
                        const nowYear = nowYearMonthDay[2]
                        const nowDayy = nowYearMonthDay[1]
                        const nowMonth = nowYearMonthDay[0]
                        const nowHour = nowHourMin[0].trimStart();
                        const nowMIn = nowHourMin[1];

                        console.log(nowDateString)
                        modalWrapper.innerHTML += `
                                <div class="modal fade" id="exampleModal${reservID}" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                    <div class="modal-dialog" role="document">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h5 class="modal-title" id="exampleModalLabel">
                                                    預約時間
                                                 </h5>
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                    <span aria-hidden="true">&times;</span>
                                                 </button>
                                            </div>
                                            <div class="modal-body">
                                                <section type= "update-section-${reservID}">
                                                    <label for="updateStartTime"> 請輸入開始日期 </label>
                                                    <input name="updateStartTime" type = "datetime-local" id= "update-start-${reservID}"
                                                        value="${nowYear}-${nowMonth}-${nowDayy}T${nowHour}:${nowMIn}">
                                                    <br>
                                                    <label for="updateEndTime"> 請輸入結束日期 </label> 
                                                    <input name="updateEndTime" type = "datetime-local" id= "update-end-${reservID}"
                                                           value="${nowYear}-${nowMonth}-${nowDayy}T${nowHour}:${nowMIn}">
                                                </section>
                                            </div>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                                <button id="make-reserv-${reservID}" type="button" class="btn btn-primary" onclick="makeReserv(event)" >confirm reservation</button>
                                            </div>
                                        </div>
                                    </div>
                                </div> `
                    } else {
                        reservSection.innerHTML +=
                            `<ul id='reservSection${reservID}' style="display:flex; justify-content:space-between;"> 
                                    <li>
                                        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal${reservID}">
                                            修改預約
                                        </button>
                                    </li>
                                    <li>
                                        <span>${startYear}</span>
                                        <span>${startMonthDay}</span> 
                                        <span>${startHourMin}-${endHourMin}</span>
                                    </li>
                                    <li>
                                        第${i + 1}堂
                                    </li>
                                </ul>`

                        modalWrapper.innerHTML += `
                                <div class="modal fade" id="exampleModal${reservID}" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                    <div class="modal-dialog" role="document">
                                        <div class="modal-content">

                                            <div class="modal-header">
                                                <h5 class="modal-title" id="exampleModalLabel">
                                                    修改預約
                                                 </h5>
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                    <span aria-hidden="true">&times;</span>
                                                 </button>
                                            </div>

                                            <div class="modal-body">
                                                <section type= "update-section-${reservID}">
                                                    <input type="datetime-local" id="update-start-${reservID}"
                                                        value="${reservDateStart}">
                                                    <input type = "datetime-local" id= "update-end-${reservID}"
                                                        value="${reservDateEnd}">
                                                </section>
                                            </div>

                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                                <button type="button" class="btn btn-primary">Save changes</button>
                                            </div>
        
                                        </div>
                                    </div>
                                </div> `


                    }
                }

            } else {
                reservSection.innerHTML += `<p>尚無預定</p>`

            }

        })

}

function makeReserv(e) {

    const reservSeq = e.target.id.split("-")[2];
    console.log(reservSeq);


    // <div class="modal fade" id="exampleModal${reservID}" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    //                                 <div class="modal-dialog" role="document">
    //                                     <div class="modal-content">
    //                                         <div class="modal-header">
    //                                             <h5 class="modal-title" id="exampleModalLabel">
    //                                                 預約時間
    //                                              </h5>
    //                                             <button type="button" class="close" data-dismiss="modal" aria-label="Close">
    //                                                 <span aria-hidden="true">&times;</span>
    //                                              </button>
    //                                         </div>
    //                                         <div class="modal-body">
    //                                             <section type= "update-section-${reservID}">
    //                                                 <label for="updateStartTime"> 請輸入開始日期 </label>
    //                                                 <input name="updateStartTime" type = "datetime-local" id= "update-start-${reservID}"
    //                                                     value="${nowYear}-${nowMonth}-${nowDayy}T${nowHour}:${nowMIn}">
    //                                                 <br>
    //                                                 <label for="updateEndTime"> 請輸入結束日期 </label> 
    //                                                 <input name="updateEndTime" type = "datetime-local" id= "update-end-${reservID}"
    //                                                        value="${nowYear}-${nowMonth}-${nowDayy}T${nowHour}:${nowMIn}">
    //                                             </section>
    //                                         </div>
    //                                         <div class="modal-footer">
    //                                             <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
    //                                             <button type="button" class="btn btn-primary" onclick="updateReservTime(event)" >confirm reservation</button>
    //                                         </div>
    //                                     </div>
    //                                 </div>
    //                             </div> `




}









