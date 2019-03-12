package com.episode6.hackit.mockspresso.reflectguava;

import com.google.common.reflect.TypeToken;
import com.google.errorprone.annotations.CheckReturnValue;

/**
 * Exists only to prevent the shadow plugin from stripping the classes we need
 * during its minimize step. Ideally minimization would just be handled by 
 * proguard, but making that work with shadow seems non-trivial. So for now
 * we use this.
 */
class Stub {
  @CheckReturnValue
  private static TypeToken<String> get() {
    return new TypeToken<String>() {};
  }
}
