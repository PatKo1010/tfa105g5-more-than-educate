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
                </table>`
            }
        }
    });


function read(e) {
    const seq = e.target.id.substring(1);
    console.log(seq);
    const table = document.querySelector(`#t${seq}`);
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
            console.log(data);
        })




}








