import jp.nyatla.mimic.mbedjs.psgapi.driver.*;
import jp.nyatla.mimic.mbedjs.psgapi.*;

Mcu mcu=new Mcu(this,"10.0.0.2");

LM75B a=new LM75B(mcu,PinName.p28,PinName.p27,0x90);

void setup()
{
}
void draw()
{
  println(a.read());
}

