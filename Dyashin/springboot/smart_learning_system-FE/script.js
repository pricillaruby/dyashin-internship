// Load courses into dropdown
fetch("http://localhost:8082/courses/getallcourses")
  .then(res => res.json())
  .then(data => {
    const dropdowns = [document.getElementById("courseDropdown"), document.getElementById("editCourse")];
    dropdowns.forEach(dropdown => {
      if (dropdown) {
        data.forEach(course => {
          const option = document.createElement("option");
          option.value = course.id;
          option.textContent = course.courseName;
          dropdown.appendChild(option);
        });
      }
    });
  });

// Registration form submission
const registerForm = document.getElementById("registerForm");
if (registerForm) {
  registerForm.addEventListener("submit", function(e) {
    e.preventDefault();
    const formData = new FormData(registerForm);
    const dob = new Date(formData.get("dob"));
    if (dob >= new Date()) return alert("DOB must be a past date");
    if (!/^\d{10}$/.test(formData.get("phone"))) return alert("Phone must be 10 digits");

    fetch("http://localhost:8082/student/addstudent", {
      method: "POST",
      body: formData
    })
    .then(res => res.json())
    .then(() => alert("Student registered successfully"))
    .catch(() => alert("Registration failed"));
  });
}

// Load students into dashboard
const studentTableBody = document.getElementById("studentTableBody");
if (studentTableBody) {
  fetch("http://localhost:8082/student/getallstudents")
    .then(res => res.json())
    .then(data => {
      data.forEach(student => {
        const row = document.createElement("tr");
        row.innerHTML = `
          <td>${student.name}</td>
          <td>${student.email}</td>
          <td>${student.phone}</td>
          <td>${student.courseName || ""}</td>
          <td>
            <button onclick="editStudent(${student.id})">Edit</button>
            <button onclick="deleteStudent(${student.id})">Delete</button>
          </td>
        `;
        studentTableBody.appendChild(row);
      });
    });
}

// Edit student
function editStudent(id) {
  fetch(`http://localhost:8082/student/getstudent/${id}`)
    .then(res => res.json())
    .then(student => {
      document.getElementById("editId").value = student.id;
      document.getElementById("editName").value = student.name;
      document.getElementById("editEmail").value = student.email;
      document.getElementById("editPhone").value = student.phone;
      document.getElementById("editDob").value = student.dob;
      document.getElementById("editGender").value = student.gender;
      document.getElementById("editCourse").value = student.courseId;
      document.getElementById("editModal").style.display = "block";
    });
}

// Update student
const editForm = document.getElementById("editForm");
if (editForm) {
  editForm.addEventListener("submit", function(e) {
    e.preventDefault();
    const id = document.getElementById("editId").value;
    const updatedData = {
      name: document.getElementById("editName").value,
      email: document.getElementById("editEmail").value,
      phone: document.getElementById("editPhone").value,
      dob: document.getElementById("editDob").value,
      gender: document.getElementById("editGender").value,
      courseId: document.getElementById("editCourse").value
    };

    fetch(`http://localhost:8082/student/updatestudent/${id}`, {
      method: "PUT",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(updatedData)
    })
    .then(() => {
      alert("Student updated");
      location.reload();
    });
  });
}

// Delete student
function deleteStudent(id) {
  fetch(`http://localhost:8082/student/deletestudent/${id}`, {
    method: "DELETE"
  })
  .then(() => {
    alert("Student deleted");
    location.reload();
  });
}