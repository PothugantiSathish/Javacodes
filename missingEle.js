//missing number=5
let num = [4, 3, 6, 2, 1]
let t
for(let i=0;i<num.length;i++){
    for(let j=i+1;j<num.length;j++){
        if(num[i] > num[j]){
            t= num[i]
            num[i] = num[j]
            num[j] = t
        }
    }
}
console.log(num)
for(let i=0;i<num.length;i++){
    if(num[i] != i+1) 
    {
        console.log("Missing num-->"+(i+1))
        break
    }
}