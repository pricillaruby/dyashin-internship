let submitbtn=document.getElementById("submitbtn")
submitbtn.addEventListener("click",function(event){
    event.preventDefault()
    let loginform=document.forms["loginform"]
    let roleAccess = loginform.role.value
    let emailfieldvalue=loginform.userEmail.value
    let passwordfieldvalue=loginform.userPassword.value
    let isvalidemail=validateEmail(emailfieldvalue)
    let isvalidpassword=validatePassword(passwordfieldvalue)
    if(isvalidemail && isvalidpassword){
        setTimeout(() => {
            alert("Form submitted succesfully")
            if(roleAccess == 'Admin'){
                window.location.href = 'AdminDashboard.html'
            }else{
                window.location.href = 'StudentRegistration.html'
            }
        }, 100);
    }
})

const validateEmail=(emailfieldvalue)=>{
    let emptyemail=document.getElementById("emptyemail")
    let invalidemail=document.getElementById("invalidemail")
    if(emailfieldvalue){
        if(/^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+(\.\w{2,3})$/.test(emailfieldvalue)){
            emptyemail.style.display="none"
            invalidemail.style.display="none"
            return true
        }else{
            emptyemail.style.display="none"
            invalidemail.style.display="block"
            return false
        }
    }else{
        emptyemail.style.display="block"
            invalidemail.style.display="none"
            return false
    }

}
const validatePassword=(passwordfieldvalue)=>{
    let emptypassword=document.getElementById("emptypassword")
    let invalidpassword=document.getElementById("invalidpassword")
    if(passwordfieldvalue){
        if(/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[\W_]).{8,}$/.test(passwordfieldvalue)){
            emptypassword.style.display="none"
            invalidpassword.style.display="none"
            return true
        }else{
            emptypassword.style.display="none"
            invalidpassword.style.display="block"
            return false
        }
    }else{
        emptypassword.style.display="block"
        invalidpassword.style.display="none"
            return false
    }

}