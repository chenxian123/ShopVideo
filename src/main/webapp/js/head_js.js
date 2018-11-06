// JavaScript Document
/*首页js*/
function s_onclick(){
    document.getElementById("head_input").value="";
}
function b_onclick(){
    var saval=document.getElementById("head_input").value;
    if(saval==""){
        document.getElementById("head_input").value="输入搜索的内容";
    }
}
function iflogin(){
    document.write(sess);
    var Alogin=document.getElementById("ha_login");
    if(sess != "null"){
        Alogin.innerHTML="${suser.suid }";
    }else{
		
    }
}