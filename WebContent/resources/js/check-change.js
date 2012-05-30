var checkChange = new function() {
  var changeStatusHash = {};
  var isSubmit = false;
  var checkChangeClass = 'check_change';
  var refreshChangeStatusClass = 'refresh_change_status';
  this.bindEvents = function (){
    jQuery('form.'+checkChangeClass).find('input.'+checkChangeClass).live('change',(function (){
      //alert(this.form.id);
      changeStatusHash[this.form.id] = true;
    }));
    //('input[type="text"],input[type="radio"],input[type="checkbox"],input[type="file"],input[type="password"]')
    jQuery('form.'+checkChangeClass).live('submit',(function (){
      isSubmit = true;
    }));
    jQuery('form.'+checkChangeClass).find('.'+refreshChangeStatusClass).live('click',function (){
      changeStatusHash[this.form.id] = false;
    });
  };
  var isChanged = function (){
    for (var key in changeStatusHash){
      if (changeStatusHash[key]){
        return true;
      }
    }
    return false;
  };
  this.check = function (){
    if (isChanged() && !isSubmit){
      return "Are you really want to leave";  
    }
  };
  this.refreshChangeStatus = function (current){
    changeStatusHash[current.form.id]=false;
  };
};
jQuery(function (){
  checkChange.bindEvents();
  window.onbeforeunload = checkChange.check;
});