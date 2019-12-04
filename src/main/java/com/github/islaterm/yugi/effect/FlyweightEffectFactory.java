package com.github.islaterm.yugi.effect;

import java.util.HashMap;
import java.util.Map;

public class FlyweightEffectFactory {
  private Map<String, IEffect> createdEffects = new HashMap<>();

  public IEffect getEffect(String effectId) {
    if (!createdEffects.containsKey(effectId)) {
      createdEffects.put(effectId, new AbstractEffect());
    }
    return createdEffects.get(effectId);
  }
}
