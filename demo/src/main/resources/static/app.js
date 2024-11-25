const API_URL = "/api/students";

// Fetch and display students
const fetchStudents = async () => {
    try {
        const response = await fetch(API_URL);
        const students = await response.json();

        const studentList = document.getElementById("studentList");
        studentList.innerHTML = "";

        students.forEach((student) => {
            const listItem = document.createElement("li");
            listItem.innerHTML = `
                <span>${student.name} (${student.email})</span>
                <button onclick="deleteStudent(${student.id})">Delete</button>
            `;
            studentList.appendChild(listItem);
        });
    } catch (error) {
        console.error("Error fetching students:", error);
    }
};

// Add a new student
document.getElementById("addStudentForm").addEventListener("submit", async (event) => {
    event.preventDefault();

    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;

    try {
        const response = await fetch(API_URL, {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify({ name, email }),
        });

        if (response.ok) {
            fetchStudents();
            document.getElementById("addStudentForm").reset();
        } else {
            console.error("Error adding student:", response.statusText);
        }
    } catch (error) {
        console.error("Error adding student:", error);
    }
});

// Delete a student
const deleteStudent = async (id) => {
    try {
        const response = await fetch(`${API_URL}/${id}`, {
            method: "DELETE",
        });

        if (response.ok) {
            fetchStudents();
        } else {
            console.error("Error deleting student:", response.statusText);
        }
    } catch (error) {
        console.error("Error deleting student:", error);
    }
};

// Initial fetch
fetchStudents();
