function findLength(num){
    let len=0
    while(num != 0){
        num = num /10;
        num=num | 0
        len++
    }
    return len
}
let n=4567
let m=5647
let nLen = findLength(n)
let mLen = findLength(m)
if(nLen == mLen){
    let nr,mr
    let cArr = [0,0,0,0,0,0,0,0,0,0]// 0--9
    while(n != 0){
        nr = n % 10;
        mr= m % 10
        n = n / 10;
        n = n | 0;
        m = m / 10
        m = m | 0
        cArr[nr]++
        cArr[mr]--
    }
    let isAnagram = true
    for(let i =0;i<=9;i++){
        if(cArr[i] != 0) 
        isAnagram = false
    }
    
    if(isAnagram == true) console.log("Both are anagrams")
    else console.log("Not Anagrams")
}
else console.log("Not Anagrams")