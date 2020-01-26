$(function() {
	// solving the active menu problem
	switch (menu) {
	case 'About Us':
		$('#about').addClass("nav-item active");
		break;

	case 'Contact Us':
		$('#contact').addClass("nav-item active");
		break;
	
	case 'All Products':
		$('#listProducts').addClass("nav-item active");
		break;
	
	default:
		$('#listProducts').addClass('nav-item active');
		break;
	}
});