"use strict";
const languageCard = document.querySelector("#language-card");

const renderLanguageCard = function (subject) {
  const subjectBytesStr = atob(subject.subjectIcon);
  let subjectLen = subjectBytesStr.length;
  const subjectu8Array = new Uint8Array(subjectLen);
  while (subjectLen--) {
    subjectu8Array[subjectLen] = subjectBytesStr.charCodeAt(subjectLen);
  }
  const subjectBlob = new Blob([subjectu8Array]);
  const subjectUrl = URL.createObjectURL(subjectBlob);

  const html = `<li class="language-list">
                <div class="icon">
                  <img src="${subjectUrl}" alt="Flag">
                </div>
                <label style="cursor: pointer" class="language-list"  subject-id=${subject.subjectId}>${subject.subjectName}</label>
               </li> `;
  languageCard.insertAdjacentHTML("beforeend", html);
};

const fetchLanguageCard = function () {
  fetch("/tfa105g5-more-than-educate/subject/allSubjects", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
  })
    .then((body) => body.json())
    .then(async (subjects) => {
      for (let subject of subjects) {
        renderLanguageCard(subject);
      }
    });
};

window.onload = function () {
  fetchLanguageCard();
};

const goToTeachers = function (subjectId) {
  window.sessionStorage.setItem("subjectId", subjectId);
  window.location.href = "./teachers.html";
};

document.addEventListener("click", function (e) {
  console.log(e.target);
  if (e.target.classList.contains("language-list")) {
    const subjectId = e.target.getAttribute("subject-id");
    goToTeachers(subjectId);
  }
});
