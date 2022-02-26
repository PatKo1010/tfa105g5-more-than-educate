"use strict";
const teacherCards = document.querySelector("#teachers-cards");

const renderTeacher = function (teacher) {
  // RENDER TEACHER URL
  const teacherBytesStr = atob(teacher.teacherPhoto);
  let teacherLen = teacherBytesStr.length;
  const teacheru8Array = new Uint8Array(teacherLen);
  while (teacherLen--) {
    teacheru8Array[teacherLen] = teacherBytesStr.charCodeAt(teacherLen);
  }
  const teacherBlob = new Blob([teacheru8Array]);
  const teacherUrl = URL.createObjectURL(teacherBlob);

  // RENDER SUBJECT URL
  const subjectBytesStr = atob(teacher.subjectIcon);
  let subjectLen = subjectBytesStr.length;
  const subjectu8Array = new Uint8Array(subjectLen);
  while (subjectLen--) {
    subjectu8Array[subjectLen] = subjectBytesStr.charCodeAt(subjectLen);
  }
  const subjectBlob = new Blob([subjectu8Array]);
  const subjectUrl = URL.createObjectURL(subjectBlob);

  const html = `<div class="col-sm-6 col-md-4 col-lg-4 col-xl-3">
    <div teacher-id = ${teacher.memId} class="card el-card">
      <a href="page-teacher.html">
        <div class="inner">
          <div class="avatar">
            <img
              src="${teacherUrl}"
              alt="teacher-pic"
            />
          </div>
          <div class="details">
            <h3>${teacher.username} ${teacher.teacherTitle}</h3>
            <p>
              ${teacher.teacherContent}
            </p>
          </div>
          <ul class="icons icons-left">
            <li>
              <div class="icon-lang">
                <img
                  src="${subjectUrl}"
                  alt="Lang"
                />
              </div>
            </li>
          </ul>
        </div>
      </a>
    </div>
  </div>`;
  teacherCards.insertAdjacentHTML("beforeend", html);
};

const fetchTeachers = function () {
  const subjectId = sessionStorage.getItem("subjectId");
  fetch("/tfa105g5-more-than-educate/subject/allTeachersBySubjectId", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify({
      subjectId: subjectId,
    }),
  })
    .then((response) => response.json())
    .then((teachers) => {
      for (let teacher of teachers) {
        renderTeacher(teacher);
      }
    });
};

window.onload = function () {
  fetchTeachers();
};
