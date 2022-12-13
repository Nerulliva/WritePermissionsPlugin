package it.cineca.cbt.writepermissions;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "WritePermissions")
public class WritePermissionsPlugin extends Plugin {

    private WritePermissions implementation = new WritePermissions();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

    @PluginMethod
    public void setWritePermissions(PluginCall call){
        boolean res = false;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            Intent intent = new Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION);
            Uri uri = Uri.fromParts("package", this.getPackageName(), null);
            intent.setData(uri);
            this.startActivityForResult(intent, APP_STORAGE_ACCESS_REQUEST_CODE);
            res = true;
        }
        JSObject ret = new JSObject();
        ret.put("value", res);
        call.resolve(ret);
    }
}
