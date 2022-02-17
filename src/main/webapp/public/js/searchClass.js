const selectCourse = document.querySelector("#select_course");
const courseTitle = document.querySelector("#course_title_input");
selectCourse.addEventListener("click", e => {
    const courseTitleValue = courseTitle.value;
    console.log (courseTitleValue);
    fetch(`../OrderDetail/selectCourse`, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            courseTitle: courseTitleValue
        })
    })
    .then(body => body.json())
    .then((orderDetailEntity) => {
        console.log(orderDetailEntity);













    })
    
    // classAmount: 3
    // classRecord: 0
    // classStatus: false
    // comment: null
    // courseIntro: "想出國深造嗎？就買這課程吧！"
    // courseTitle: "出國留學必備證照"
    // expertiseId: 2001
    // orderDate: 1641052800000
    // orderID: 2
    // price: 1380
    // rate: null
    // sName: "Eric"
    // tName: "Huang"
    // transStatus: false




});