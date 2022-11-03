function int32ToIp(int32){
     return getBit(int32, 24, 32) + "." + getBit(int32, 16, 24) + "." + getBit(int32, 8, 16) + "." + getBit(int32, 0, 8);
}
function getBit(number, left, kth){
  let bitmask = ((1 << (kth-left)) - 1) << left;
  return ((number & bitmask) >> left) & 0xff;
}
