package com.util;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlElement;

public class RestResponse {
    public static final int ARRAY_SIZE = 10;
    private Map<String, Object> retObjects = new HashMap(10);

    public void setRetCode(int retCode)
    {
      this.retObjects.put("retcode", Integer.valueOf(retCode));
    }

    public int getRetCode()
    {
      Object retcode = this.retObjects.get("retcode");

      if (retcode == null)
      {
        return 0;
      }

      return Integer.parseInt(retcode.toString());
    }

    public void setRetObject(String key, Object object)
    {
      this.retObjects.put(key, object);
    }

    public Object getRetObject(String key)
    {
      return this.retObjects.get(key);
    }

    public void setSuccess(Boolean value)
    {
      this.retObjects.put("success", value);
    }

    public Boolean getSuccess()
    {
      boolean rtn = false;
      if ((this.retObjects.get("success") != null) && 
        ("true".equalsIgnoreCase(this.retObjects.get("success").toString())))
      {
        rtn = true;
      }
      else
      {
        rtn = false;
      }
      return Boolean.valueOf(rtn);
    }

    @XmlElement(name="EccJsonReturnResponse")
    public Map<String, Object> returnResult()
    {
      return this.retObjects;
    }
}
