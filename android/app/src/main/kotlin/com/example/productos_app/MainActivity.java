package com.example.productos_app;

import androidx.annotation.NonNull;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;

public class MainActivity extends FlutterActivity {
  private static final String CHANNEL = "com.example.productos_app/MainActivity";

  
  @Override
  public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
  super.configureFlutterEngine(flutterEngine);
    new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), CHANNEL)
    .setMethodCallHandler(
        (call, result) -> {
            // This method is invoked on the main thread.
            if(call.method.equals("getSaludos")){
                String saludo = getSaludos();
                result.success(saludo);
            } else {
                result.notImplemented();
            }
        }
        );
    }
    
    private String getSaludos(){
    String saludo= "Saludo de flutter desde java";
    System.out.println(saludo);
    return saludo;
  }

  

}





