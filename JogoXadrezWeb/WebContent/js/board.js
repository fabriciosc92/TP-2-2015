$( document ).ready(function(){
	
    $("#chess_board td a").draggable();
    $("#chess_board td").droppable(
	{
        drop: function(event, ui)
		{
            var $this = $(this);
            $this.append(ui.draggable);    
            
            var width = $this.width();
            var height = $this.height();
            var cntrLeft = (width / 2) - (ui.draggable.width() / 2);
            var cntrTop = (height / 2) - (ui.draggable.height() / 2);
            
            ui.draggable.css(
			{
                left: cntrLeft + "px",
                top: cntrTop + "px"
            });
        }
    });
});