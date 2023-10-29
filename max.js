let a=300
let b=200
let c=100
let max,min

if(a>b){
    max=a
    min=b
}
else{
    max=b
    min=a
}
if(c>max) max=c
if(c<min) min=c
if(a>b&&a>c) max=a
if(b>a&&b>c) max=b

console.log("max---->"+max)
console.log("min---->"+min)