// let matrix = [ 
//     [1,2,3],
//     [4,5,6],
//     [7,8,9]
//   ]
// let rSum = [0,0,0]            
// for(let r=0;r<3;r++){
// for(let c=0;c<3;c++){
// rSum[r] = rSum[r] + matrix[r][c] // [0][0],[0][1],[0][2]
// }
// }  

// for(let i=0;i<3;i++){
// console.log("Row "+(i+1)+" Sum--->"+rSum[i])
// }

// let matrix = [ 
//     [1,2,3],
//     [4,5,6],
//     [7,8,9]
//   ]
// let cSum = [0,0,0]            
// for(let r=0;r<3;r++){
// for(let c=0;c<3;c++){
// cSum[c] = cSum[c] + matrix[r][c] 
// }
// }  

// for(let i=0;i<3;i++){
// console.log("colunm"+(i+1)+" Sum--->"+cSum[i])
// }

let matrix = [ 
    [1,2,3,4,5],
    [4,5,6,7,8],
    [7,8,9,1,2],
    [1,2,3,4,5],
    [6,7,8,9,1]
  ]
  let leftsump=0;
  let rightsum=0;
  let topsum=0;
  let bottomsum=0;
  
