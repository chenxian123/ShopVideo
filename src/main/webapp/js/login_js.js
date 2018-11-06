/*login登陆页面js*/
var check = false;
function nameonclik(){
    var naval=document.getElementById("name");
    if(naval.value=="请输入用户名"){
        naval.value="";
        check=false;
    }else{
        check=true;
    }
    return check;
}
function nameonblur(){
    var msg="";
    naval=document.getElementById("name");
    msgbcn=document.getElementsByClassName("msg");
    var txt = new RegExp(/[~`@\/|{}?*^$#@!.,:;"'<>%;()(&+！@#￥%……&*（）《》？“：{}~]/);
    if(naval.value==""){
        naval.value="请输入用户名";
        msgbcn[0].innerHTML="";
        check=false;
    }else if(txt.test(naval.value)){
        msg +="禁止输入特殊字符串";
        msgbcn[0].innerHTML=msg;
        check=false;
    }else{
        msgbcn[0].innerHTML="";
        check=true;
    }
    return check;
}
function pwdonclik(){
    pwdval=document.getElementById("pwd");
    if(pwdval.value=="请输入密码"){
        pwdval.value="";
        pwdval.setAttribute("type","password");
        check=false;
    }else{
        check=true;
    }
    return check;
}
function pwdonblur(){
    pwdval=document.getElementById("pwd");
    if(pwdval.value==""){
        pwdval.setAttribute("type","text");
        pwdval.value="请输入密码";
        check=false;
    }else{
        check=true;
    }
    return check;
}
function logincheck(){
    var checks=nameonclik()&&nameonblur()&&pwdonblur()&&pwdonclik();
    return checks;
}
