package net.leanix.swaggerdemo.api.auth;

import net.leanix.swaggerdemo.api.Pair;

import java.util.Map;
import java.util.List;

public class OAuth implements Authentication {
  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
    // TODO: support oauth
  }
}
