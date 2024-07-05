function testHoisting()
{
name = "Saching";
console.log(name);
var name ; 

setTimeout(() => {console.log("Timeout ");}, 2000); 
console.log("after timeout");
setInterval(() => {console.log("Interval")}, 3000);
fetch("http://www.google.com/");
console.log("after all operations ");
}
testHoisting();

// callback 