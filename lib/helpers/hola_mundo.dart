import 'package:flutter/services.dart';

const platform = const MethodChannel('com.example.productos_app/channel');

// Invoca un método en Java y espera su resultado
Future<void> getNativeString() async {
  try {
    print("probando java");
    // final String result = await platform.invokeMethod('getNativeString');

    // return result;
  } on PlatformException catch (e) {
    print(e.toString());
    // return "Error: '${e.message}'.";
  }
}
