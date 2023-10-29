function isprime(num){
let count=0
for(let i=100;i<=num;i++){
    if(num%i==0)
    count++
}
    if(count==2) return true
    else return false
}
for(let k=100,count=0;k>1;k--){
    if(isprime(k)==true){
        console.log(k)
        count++
        if(count==7){
        break
        }
    }
}
console.log(isprime())

