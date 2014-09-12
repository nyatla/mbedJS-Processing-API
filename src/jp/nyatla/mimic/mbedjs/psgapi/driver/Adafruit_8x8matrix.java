package jp.nyatla.mimic.mbedjs.psgapi.driver;

import jp.nyatla.mimic.mbedjs.MbedJsException;
import jp.nyatla.mimic.mbedjs.psgapi.I2C;
import jp.nyatla.mimic.mbedjs.psgapi.JavaObjectWrapper;
import jp.nyatla.mimic.mbedjs.psgapi.Mcu;

/**
 * 
 *
 */
public class Adafruit_8x8matrix extends JavaObjectWrapper<jp.nyatla.mimic.mbedjs.javaapi.driver.adafruit.Adafruit_8x8matrix>
{
	private static jp.nyatla.mimic.mbedjs.javaapi.driver.adafruit.Adafruit_8x8matrix _new(I2C i_i2c,int i_address){
		return new jp.nyatla.mimic.mbedjs.javaapi.driver.adafruit.Adafruit_8x8matrix(i_i2c.getSuperInstance(),i_address);
	}
	private static jp.nyatla.mimic.mbedjs.javaapi.driver.adafruit.Adafruit_8x8matrix _new(Mcu i_mcu, int sda, int scl, int i_address){
		try{
			return new jp.nyatla.mimic.mbedjs.javaapi.driver.adafruit.Adafruit_8x8matrix(i_mcu.getSuperInstance(),sda,scl,i_address);
		}catch(MbedJsException e){
			throw new RuntimeException(e);
		}
	}
	public Adafruit_8x8matrix(I2C i_i2c,int i_address)
	{
		super(_new(i_i2c,i_address));
	}
	public Adafruit_8x8matrix(Mcu i_mcu, int sda, int scl, int i_address)
	{
		super(_new(i_mcu,sda,scl,i_address));


		
	}
	public void dispose()
	{
		try {
			this._inst.dispose();
		} catch (MbedJsException e) {
			throw new RuntimeException(e);
		}
	}
	public void begin(){
		try {
			this._inst.begin();
		} catch (MbedJsException e) {
			throw new RuntimeException(e);
		}
	}
	public void clear()
	{
		this._inst.clear();
	}
	public void drawBitmap(int i_x,int i_y,byte[] i_bitmap,int i_w,int i_h,int i_color)
	{
		this._inst.drawBitmap(i_x, i_y, i_bitmap, i_w, i_h, i_color);
	}
	public void drawChar(int i_x,int y,int i_c,int i_color,int i_bg,int i_size)
	{
		this._inst.drawChar(i_x, y, i_c, i_color, i_bg, i_size);
	}
	public void drawCircle(int i_x0,int i_y0,int i_r,int i_color){
		this._inst.drawCircle(i_x0, i_y0, i_r, i_color);
	}
	public void drawFastHLine(int i_x,int i_y,int i_w,int i_color)
	{
		this._inst.drawFastHLine(i_x, i_y, i_w, i_color);
	}
	public void drawLine(int i_x0,int i_y0,int i_x1,int i_y1,int i_color)
	{
		this._inst.drawLine(i_x0, i_y0, i_x1, i_y1, i_color);
	}
	public void drawPixel(int i_x,int i_y,int i_color)
	{
		this._inst.drawPixel(i_x, i_y, i_color);
	}
	public void drawRect(int i_x,int i_y,int i_w,int i_h,int i_color)
	{
		this._inst.drawRect(i_x, i_y, i_w, i_h, i_color);
	}
	public void drawRoundRect(int i_x,int i_y,int i_width,int i_height,int i_r,int i_color){
		this._inst.drawRoundRect(i_x, i_y, i_width, i_height, i_r, i_color);
	}
	public void drawTriangle(int i_x0,int i_y0,int i_x1,int i_y1,int i_x2,int i_y2,int i_color){
		this._inst.drawTriangle(i_x0, i_y0, i_x1, i_y1, i_x2, i_y2, i_color);
	}
	public void fillCircle(int i_x0,int i_y0,int i_r,int i_color)
	{
		this._inst.fillCircle(i_x0, i_y0, i_r, i_color);
	}
	public void fillRect(int i_x,int i_y,int i_w,int i_h,int i_color){
		this._inst.fillRect( i_x, i_y, i_w, i_h, i_color);
	}
	public void fillRoundRect(int i_x,int i_y,int i_w,int i_h,int i_r,int i_color){
		this._inst.fillRoundRect(i_x, i_y, i_w, i_h, i_r, i_color);
	}
	public void fillScreen(int i_color)
	{
		this._inst.fillScreen(i_color);
	}
	public void fillTriangle(int i_x0,int i_y0,int i_x1,int i_y1,int i_x2,int i_y2,int i_color)
	{
		this._inst.fillTriangle(i_x0, i_y0, i_x1, i_y1, i_x2, i_y2, i_color);
	}
	public int getRotation()
	{
		return this._inst.getRotation();
	}
	public int height()
	{
		return this._inst.height();
	}
	public void invertDisplay(boolean i_invert)
	{
		this._inst.invertDisplay(i_invert);
	}
	public void setBrightness(int i_bright){
		try {
			this._inst.setBrightness(i_bright);
		} catch (MbedJsException e) {
			throw new RuntimeException(e);
		}
	}
	public void setCursor(int i_x,int i_y){
		this._inst.setCursor(i_x,i_y);
	}
	public void setRotation(int i_x){
		this._inst.setRotation(i_x);
	}
	public void setTextColor(int i_color){
		this._inst.setTextColor(i_color);
	}
	public void setTextColor(int i_col,int i_bg){
		this._inst.setTextColor(i_col,i_bg);
	}
	public void setTextSize(int i_size)
	{
		this._inst.setTextSize(i_size);
	}
	public void setTextWrap(boolean i_wrap)
	{
		this._inst.setTextWrap(i_wrap);
	}
	
	public int width()
	{
		return this.width();
	}
	public int writeChar(byte i_ch)
	{
		return this._inst.writeChar(i_ch);
	}
	public void writeDisplay(){
		try {
			this._inst.writeDisplay();
		} catch (MbedJsException e) {
			throw new RuntimeException(e);
		}		
	}
	public final static int LED_GREEN=jp.nyatla.mimic.mbedjs.javaapi.driver.adafruit.Adafruit_8x8matrix.LED_GREEN;
	public final static int LED_OFF=jp.nyatla.mimic.mbedjs.javaapi.driver.adafruit.Adafruit_8x8matrix.LED_OFF;
	public final static int LED_RED=jp.nyatla.mimic.mbedjs.javaapi.driver.adafruit.Adafruit_8x8matrix.LED_RED;
	public final static int LED_YELLOW=jp.nyatla.mimic.mbedjs.javaapi.driver.adafruit.Adafruit_8x8matrix.LED_YELLOW;
	
}