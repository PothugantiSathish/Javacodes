let a=123456
let evensum=0
let oddsum=0
let r
while(a!=0){
    r=a%10
    a=a/10
    a=parseInt(a,10)
    if(r%2==0)
    evensum=evensum+r
    if(r%2!=0)
    oddsum=oddsum+r
}
console.log(evensum)
console.log(oddsum)

