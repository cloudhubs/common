package edu.baylor.ecs.seer.common.context;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SeerMsContext {

  /*
   * Name of the Microservice
   */
  private String moduleName;

  /*
   * Entity Context
   */
  private SeerComponentsContext components;

  /*
   * Security Semantic Context
   */
  //    private SeerSemanticContext semantic;

  /*
   * Security Syntax Context
   */
  private SeerSyntaxContext syntax;

  //    /*
  //     * Seer Flow Context
  //     */
  //    private SeerFlowContext flow;
  //
  //    /*
  //     * Seer Api Context
  //     */
  //    private SeerApiContext api;
  //
  //    /*
  //     * Seer Security Context
  //     */
  //    private SeerSecurityContext security;

}
