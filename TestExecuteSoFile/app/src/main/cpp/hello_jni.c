#include <jni.h>
#include "get_msg.h"

JNIEXPORT jstring JNICALL
Java_com_example_testexecutesofile_MainActivity_getMsg(JNIEnv *env, jobject thiz) {
    const char* msg = get_msg();
    return (*env)->NewStringUTF(env, msg);
}
