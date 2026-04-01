class CaseEvidence {
 private int evidenceId;
 private String caseName;
 private String evidenceType;
 private String description;
 private String collectedBy;
 private String date;
 private String status;

 public void setEvidenceId(int evidenceId){
   this.evidenceId = evidenceId;
 }
 public int getEvidenceId(){
   return this.evidenceId;
 }

 public void setCaseName(String caseName){
   this.caseName = caseName;
 }
 public String getCaseName(){
   return this.caseName;
 }

 public void setEvidenceType(String evidenceType){
   this.evidenceType = evidenceType;
 }
 public String getEvidenceType(){
   return this.evidenceType;
 }

 public void setDescription(String description){
   this.description = description;
 }
 public String getDescription(){
   return this.description;
 }

 public void setCollectedBy(String collectedBy){
   this.collectedBy = collectedBy;
 }
 public String getCollectedBy(){
   return this.collectedBy;
 }

 public void setDate(String date){
   this.date = date;
 }
 public String getDate(){
   return this.date;
 }

 public void setStatus(String status){
   this.status = status;
 }
 public String getStatus(){
   return this.status;
 }
}