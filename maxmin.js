let num = 56789
// 
//
let r
let max=0
let min=9
while(num != 0){
    r = num % 10
    num = num / 10
    num = parseInt(num,10)
    if( r > max) max=r
    if( r < min) min = r
}

console.log("max--->"+max)
console.log("min--->"+min)