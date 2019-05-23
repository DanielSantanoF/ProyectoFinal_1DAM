$(document).ready(function() {
    $("#show_hide_password a").on('mouseover', function(event) {
        event.preventDefault();
        if($('#show_hide_password input').attr("type") == "text"){
            $('#show_hide_password input').attr('type', 'password');
            $('#show_hide_password i').addClass( "fa-eye-slash" );
            $('#show_hide_password i').removeClass( "fa-eye" );
        }else if($('#show_hide_password input').attr("type") == "password"){
            $('#show_hide_password input').attr('type', 'text');
            $('#show_hide_password i').removeClass( "fa-eye-slash" );
            $('#show_hide_password i').addClass( "fa-eye" );
        }
    });
});

//Comprobar contraseña
function passwordValidator() {
    var p1 = document.getElementById("passwordOne").value;;
    var p2 = document.getElementById("passwordTwo").value;
    if (p1 == '')
        alert("Por favor, introduzca una contraseña");
    else if (p2 == '')
        alert("Por favor, confirme su contraseña");
    else if (p1 != p2) {
        alert("\nLas contraseñas no coinciden, intentelo de nuevo")
        return false;
    } else {
        alert("Registro con éxito")
        document.register.submit();
    }
}