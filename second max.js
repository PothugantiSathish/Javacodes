let a=600
let b=400
let c=350
let smax

if((a>b)&&(c>b)&&(a<c) ){
    smax =a
}
else if(b > c){
    smax=b
}
else{
    smax=c
}

console.log("smax--->"+smax)