const container = document.getElementById("container");
const registerBtn = document.getElementById("register");
const loginBtn = document.getElementById("login");
const registerForm = document.getElementById("registerForm");
const loginForm = document.getElementById("loginForm");

registerBtn.addEventListener("click", ()=>{
    container.classList.add("active");
} );

loginBtn.addEventListener("click", ()=>{
    container.classList.remove("active");
} );

registerForm.addEventListener("submit", async (e) => {
    e.preventDefault();

    const user = {
        name: document.getElementById("registerName").value,
        email: document.getElementById("registerEmail").value,
        password: document.getElementById("registerPassword").value
    };

    const response = await fetch("http://localhost:8080/users/register", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(user)
    });

    const data = await response.json();
    console.log("Usuario registrado:", data);
    alert("Registro exitoso");
});

loginForm.addEventListener("submit", async (e) => {
    e.preventDefault();

    const user = {
        email: document.getElementById("loginEmail").value,
        password: document.getElementById("loginPassword").value
    };

    const response = await fetch("http://localhost:8080/users/login", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(user)
    });

    const data = await response.json();

    if (data) {
        alert("Bienvenido " + data.name);
    } else {
        alert("Credenciales incorrectas");
    }
});