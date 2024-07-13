async function fun()
{
    await fetch("http://www.google.com/");
    console.log("one");
    console.log("one");
    await fetch("http://www.google.com/");
    console.log("one");
}
async function fun2()
{
    console.log("two");
    await fetch("http://www.google.com/");
    console.log("two");
    console.log("two");
    await fetch("http://www.google.com/");
    console.log("two");
}
async function fun3()
{
    console.log("three");
    console.log("three");
    console.log("three");
    await fetch("http://www.google.com/");
    console.log("three");

}
function test()
{
    fun();
    fun2();
    fun3();
}
// test();
async function getFromGoogle()
{
    console.log("waiting for data from google");
    var data = await fetch("http://www.google.com/");
    console.log(data);
    
    var prm = fetch("http://");
    prm.then(function resolve(res) {
        console.log(res); },
        function rejected(err) { 
            console.log("error", err);
        })
    console.log("after promise");
    
}
// getFromGoogle();



async function sum(a, b)
{
    return a + b;
}
function sum1(a,b)
{
    var prm = new Promise(function(resolve, reject) {
        try{
        //do the processing that takes time
        let c = a + b;
        // when processing is done, call resolve(result)
        resolve(c);
        }
        catch(err)
        {
            //call reject(err)
            reject(err);
        }
    });
    return prm;

}
async function testSum()
{
    let x = sum(3,4);
    console.log(x); //will print promise
    let prm = sum(3,4);
    prm.then(function (result) { 
        console.log(result);
    });
    let result = await sum(3,4); //will wait for promise to finish and return the value 
    console.log(result);
    let y = sum1(3,4);
    console.log(y);
    let res = await sum1(3,4);
    console.log(res);
    let prm1 = sum1(3,4);
    prm.then( out => console.log(out) );
    res = await sum1(4, 3);
    console.log(res);
}
testSum();