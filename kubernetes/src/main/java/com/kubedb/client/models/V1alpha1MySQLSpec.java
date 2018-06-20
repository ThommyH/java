/*
 * KubeDB
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * Contact: hello@appscode.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kubedb.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kubedb.client.models.ComGithubAppscodeKubeMonApiAgentSpec;
import com.kubedb.client.models.V1alpha1BackupScheduleSpec;
import com.kubedb.client.models.V1alpha1InitSpec;
import io.kubernetes.client.models.V1Affinity;
import io.kubernetes.client.models.V1LocalObjectReference;
import io.kubernetes.client.models.V1PersistentVolumeClaimSpec;
import io.kubernetes.client.models.V1ResourceRequirements;
import io.kubernetes.client.models.V1SecretVolumeSource;
import io.kubernetes.client.models.V1Toleration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * V1alpha1MySQLSpec
 */

public class V1alpha1MySQLSpec {
  @SerializedName("affinity")
  private V1Affinity affinity = null;

  @SerializedName("backupSchedule")
  private V1alpha1BackupScheduleSpec backupSchedule = null;

  @SerializedName("databaseSecret")
  private V1SecretVolumeSource databaseSecret = null;

  @SerializedName("doNotPause")
  private Boolean doNotPause = null;

  @SerializedName("imagePullSecrets")
  private List<V1LocalObjectReference> imagePullSecrets = null;

  @SerializedName("init")
  private V1alpha1InitSpec init = null;

  @SerializedName("monitor")
  private ComGithubAppscodeKubeMonApiAgentSpec monitor = null;

  @SerializedName("nodeSelector")
  private Map<String, String> nodeSelector = null;

  @SerializedName("replicas")
  private Integer replicas = null;

  @SerializedName("resources")
  private V1ResourceRequirements resources = null;

  @SerializedName("schedulerName")
  private String schedulerName = null;

  @SerializedName("storage")
  private V1PersistentVolumeClaimSpec storage = null;

  @SerializedName("tolerations")
  private List<V1Toleration> tolerations = null;

  @SerializedName("version")
  private String version = null;

  public V1alpha1MySQLSpec affinity(V1Affinity affinity) {
    this.affinity = affinity;
    return this;
  }

   /**
   * If specified, the pod&#39;s scheduling constraints
   * @return affinity
  **/
  @ApiModelProperty(value = "If specified, the pod's scheduling constraints")
  public V1Affinity getAffinity() {
    return affinity;
  }

  public void setAffinity(V1Affinity affinity) {
    this.affinity = affinity;
  }

  public V1alpha1MySQLSpec backupSchedule(V1alpha1BackupScheduleSpec backupSchedule) {
    this.backupSchedule = backupSchedule;
    return this;
  }

   /**
   * BackupSchedule spec to specify how database backup will be taken
   * @return backupSchedule
  **/
  @ApiModelProperty(value = "BackupSchedule spec to specify how database backup will be taken")
  public V1alpha1BackupScheduleSpec getBackupSchedule() {
    return backupSchedule;
  }

  public void setBackupSchedule(V1alpha1BackupScheduleSpec backupSchedule) {
    this.backupSchedule = backupSchedule;
  }

  public V1alpha1MySQLSpec databaseSecret(V1SecretVolumeSource databaseSecret) {
    this.databaseSecret = databaseSecret;
    return this;
  }

   /**
   * Database authentication secret
   * @return databaseSecret
  **/
  @ApiModelProperty(value = "Database authentication secret")
  public V1SecretVolumeSource getDatabaseSecret() {
    return databaseSecret;
  }

  public void setDatabaseSecret(V1SecretVolumeSource databaseSecret) {
    this.databaseSecret = databaseSecret;
  }

  public V1alpha1MySQLSpec doNotPause(Boolean doNotPause) {
    this.doNotPause = doNotPause;
    return this;
  }

   /**
   * If DoNotPause is true, controller will prevent to delete this Mysql object. Controller will create same Mysql object and ignore other process.
   * @return doNotPause
  **/
  @ApiModelProperty(value = "If DoNotPause is true, controller will prevent to delete this Mysql object. Controller will create same Mysql object and ignore other process.")
  public Boolean isDoNotPause() {
    return doNotPause;
  }

  public void setDoNotPause(Boolean doNotPause) {
    this.doNotPause = doNotPause;
  }

  public V1alpha1MySQLSpec imagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public V1alpha1MySQLSpec addImagePullSecretsItem(V1LocalObjectReference imagePullSecretsItem) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets = new ArrayList<V1LocalObjectReference>();
    }
    this.imagePullSecrets.add(imagePullSecretsItem);
    return this;
  }

   /**
   * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use.
   * @return imagePullSecrets
  **/
  @ApiModelProperty(value = "ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use.")
  public List<V1LocalObjectReference> getImagePullSecrets() {
    return imagePullSecrets;
  }

  public void setImagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
  }

  public V1alpha1MySQLSpec init(V1alpha1InitSpec init) {
    this.init = init;
    return this;
  }

   /**
   * Init is used to initialize database
   * @return init
  **/
  @ApiModelProperty(value = "Init is used to initialize database")
  public V1alpha1InitSpec getInit() {
    return init;
  }

  public void setInit(V1alpha1InitSpec init) {
    this.init = init;
  }

  public V1alpha1MySQLSpec monitor(ComGithubAppscodeKubeMonApiAgentSpec monitor) {
    this.monitor = monitor;
    return this;
  }

   /**
   * Monitor is used monitor database instance
   * @return monitor
  **/
  @ApiModelProperty(value = "Monitor is used monitor database instance")
  public ComGithubAppscodeKubeMonApiAgentSpec getMonitor() {
    return monitor;
  }

  public void setMonitor(ComGithubAppscodeKubeMonApiAgentSpec monitor) {
    this.monitor = monitor;
  }

  public V1alpha1MySQLSpec nodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

  public V1alpha1MySQLSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<String, String>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

   /**
   * NodeSelector is a selector which must be true for the pod to fit on a node
   * @return nodeSelector
  **/
  @ApiModelProperty(value = "NodeSelector is a selector which must be true for the pod to fit on a node")
  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }

  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }

  public V1alpha1MySQLSpec replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * Number of instances to deploy for a MySQL database.
   * @return replicas
  **/
  @ApiModelProperty(value = "Number of instances to deploy for a MySQL database.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public V1alpha1MySQLSpec resources(V1ResourceRequirements resources) {
    this.resources = resources;
    return this;
  }

   /**
   * Compute Resources required by the sidecar container.
   * @return resources
  **/
  @ApiModelProperty(value = "Compute Resources required by the sidecar container.")
  public V1ResourceRequirements getResources() {
    return resources;
  }

  public void setResources(V1ResourceRequirements resources) {
    this.resources = resources;
  }

  public V1alpha1MySQLSpec schedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
    return this;
  }

   /**
   * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.
   * @return schedulerName
  **/
  @ApiModelProperty(value = "If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.")
  public String getSchedulerName() {
    return schedulerName;
  }

  public void setSchedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
  }

  public V1alpha1MySQLSpec storage(V1PersistentVolumeClaimSpec storage) {
    this.storage = storage;
    return this;
  }

   /**
   * Storage spec to specify how storage shall be used.
   * @return storage
  **/
  @ApiModelProperty(required = true, value = "Storage spec to specify how storage shall be used.")
  public V1PersistentVolumeClaimSpec getStorage() {
    return storage;
  }

  public void setStorage(V1PersistentVolumeClaimSpec storage) {
    this.storage = storage;
  }

  public V1alpha1MySQLSpec tolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  public V1alpha1MySQLSpec addTolerationsItem(V1Toleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<V1Toleration>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

   /**
   * If specified, the pod&#39;s tolerations.
   * @return tolerations
  **/
  @ApiModelProperty(value = "If specified, the pod's tolerations.")
  public List<V1Toleration> getTolerations() {
    return tolerations;
  }

  public void setTolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
  }

  public V1alpha1MySQLSpec version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version of MySQL to be deployed.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "Version of MySQL to be deployed.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1MySQLSpec v1alpha1MySQLSpec = (V1alpha1MySQLSpec) o;
    return Objects.equals(this.affinity, v1alpha1MySQLSpec.affinity) &&
        Objects.equals(this.backupSchedule, v1alpha1MySQLSpec.backupSchedule) &&
        Objects.equals(this.databaseSecret, v1alpha1MySQLSpec.databaseSecret) &&
        Objects.equals(this.doNotPause, v1alpha1MySQLSpec.doNotPause) &&
        Objects.equals(this.imagePullSecrets, v1alpha1MySQLSpec.imagePullSecrets) &&
        Objects.equals(this.init, v1alpha1MySQLSpec.init) &&
        Objects.equals(this.monitor, v1alpha1MySQLSpec.monitor) &&
        Objects.equals(this.nodeSelector, v1alpha1MySQLSpec.nodeSelector) &&
        Objects.equals(this.replicas, v1alpha1MySQLSpec.replicas) &&
        Objects.equals(this.resources, v1alpha1MySQLSpec.resources) &&
        Objects.equals(this.schedulerName, v1alpha1MySQLSpec.schedulerName) &&
        Objects.equals(this.storage, v1alpha1MySQLSpec.storage) &&
        Objects.equals(this.tolerations, v1alpha1MySQLSpec.tolerations) &&
        Objects.equals(this.version, v1alpha1MySQLSpec.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affinity, backupSchedule, databaseSecret, doNotPause, imagePullSecrets, init, monitor, nodeSelector, replicas, resources, schedulerName, storage, tolerations, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1MySQLSpec {\n");
    
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    backupSchedule: ").append(toIndentedString(backupSchedule)).append("\n");
    sb.append("    databaseSecret: ").append(toIndentedString(databaseSecret)).append("\n");
    sb.append("    doNotPause: ").append(toIndentedString(doNotPause)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    init: ").append(toIndentedString(init)).append("\n");
    sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
