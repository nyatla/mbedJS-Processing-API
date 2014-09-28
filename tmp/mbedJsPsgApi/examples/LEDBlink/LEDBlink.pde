import jp.nyatla.mimic.mbedjs.psgapi.*;

Mcu mcu=new Mcu(this,"10.0.0.2");

DigitalOut a=new DigitalOut(mcu,PinName.LED1);
int c=1;
void setup()
{
}
void draw()
{
  a.write((c/10)%2);
  c++;
}

