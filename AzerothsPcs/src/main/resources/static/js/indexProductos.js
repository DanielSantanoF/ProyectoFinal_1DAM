$(document).ready(function() {
	changePageAndSize();
});

// Permite recargar la página cada vez que cambia el tamaño de página
function changePageAndSize() {
	$('#pageSizeSelect').change(function(evt) {
		window.location.replace("/admin/listaProductos?pageSize=" + this.value + "&page=1");
	});
}