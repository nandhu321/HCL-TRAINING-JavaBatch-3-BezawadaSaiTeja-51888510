events=[];
        document.getElementById("addevent").addEventListener('click',function()

{

var inputbox=document.getElementById("eventname");
if(events.length>0)
{
    let cou=0;
    for(let i=0;i<events.length;i++)
    {
        if(events[i]===inputbox.value)
        {
          cou=cou+1; 
         
        }
        
    }
    if(cou<1)
    {
        events.push(inputbox.value);
        document.getElementById("msg").innerHTML="Event name added successfully";
    }
    else{
        document.getElementById("msg").innerHTML="Event name already exists .Try with some other name";
    }
    
    
}
    else{
    events.push(inputbox.value);
    document.getElementById("msg").innerHTML="Event name added successfully";
    

}
console.log(events)
}
);
document.getElementById("displayevent").addEventListener('click',showDiv);
function showDiv() {
   document.getElementById('dis').style.display = "block";
}
document.getElementById("displayevent").addEventListener('click',function(){
    events.sort();
    result="";
    for(let event of events){
        result+='<li>'+event+'<\li>';
    }
    document.getElementById("ul").innerHTML=result;

    document.getElementById("ul").style.listStyle = "none";
    });