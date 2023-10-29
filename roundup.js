// let num=11.34456
// let a=num*100
// a=a|10
// let last=a%10
// a=a/10
// a=a|10
// if(last>5)m++
// a=a/100
// console.log(a)
function myRoundOff(num,r){
    let p=1;
   for(let i=1;i<=r+1;i++){
       p = p*10;
   }
   // 1 * 10 * 10 * 10---- 1000
   
   let m = num * p
   p = p / 10
   p = p | 0
   m = m | 0// 12456
   let last = m % 10
   m = m / 10 // 12456 /10 -----1245.6
   m = m | 0
   if(last >5) m++ // 1246
   m = m / p // 12.46

   return m
}

console.log(myRoundOff(1.4567895,3))