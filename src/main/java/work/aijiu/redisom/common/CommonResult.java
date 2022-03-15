package work.aijiu.redisom.common;

public class CommonResult {

    /**
     * 响应码
     */
    private Integer status;

    /**
     * 响应信息
     */
    private String msg;

    /**
     * 响应的数据
     */
    private Object data;

    /**
     *
     */
    private String ok;

    public static CommonResult build(Integer status,String msg,Object data){
        return new CommonResult(status,msg,data);
    }
    public static CommonResult ok(Object data){
        return new CommonResult(data);
    }
    public static CommonResult ok(){
        return new CommonResult(null);
    }
    public static CommonResult errorMsg(String msg){
        return new CommonResult(500,msg,null);
    }
    public static CommonResult errorMap(Object data){
        return new CommonResult(501,"error",data);
    }
    public static CommonResult errorTokenMsg(String msg){
        return new CommonResult(502,msg,null);
    }
    public static CommonResult errorRolesMsg(String msg){
        return new CommonResult(503,msg,null);
    }
    public static CommonResult errorException(String msg){
        return new CommonResult(555,msg,null);
    }

    public CommonResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public CommonResult() {
    }

    public CommonResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Boolean isOk(){
        return this.status ==200;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }
}
