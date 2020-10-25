$(function(){

	$('.layui-nav-child').on({
		click:function(){
			if($(this).text().trim() == "显示"){
				$('.layui-body').load('showTDL');
	       	}
    	}
  	},'dd');
  
});