$(function(){

	//Solving the active menu problem
	switch(menu){
	
	case 'About Us':
		$('#about').addclass('active');
	     break;
	case 'Contact Us':
		$('#contact').addclass('active');
		break;
	case 'AllProducts':
		$('#listProducts').addClass('active');
		break;
	
		default:
			$('#listProducts').addclass('active');
		    $('#a_'+menu).addClass('active');
		break;
	}
	
});

