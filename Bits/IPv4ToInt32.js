//https://www.codewars.com/kata/52ea928a1ef5cfec800003ee
function ipv4ToInt32(ip){
  let octets = ip.split(".");
  let number = (octets[3] | (octets[2] << 8) | (octets[1] << 16) | (octets[0] << 24)) >>> 0;
  return number;
}
