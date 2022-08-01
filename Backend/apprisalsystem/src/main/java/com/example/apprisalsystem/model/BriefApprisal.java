package com.example.apprisalsystem.model;


import javax.persistence.*;

@Entity
public class BriefApprisal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;
    private int empId;
    private int selfEvaluation;
    private int reportingAndAnalysis;
    private int goalManagement;
    private int learningAndDevelopment;
    private int deployment;
    private int configurability;
    private int integration;
    private int communication;
    private int friendlinessToPeers;
    private int approchable;
    private int teamPlayer;
    private int abilityToTakeLead;
    private int contributionToProject;
    private int onTimeDeliveryOfProject;
    private int clientFeedback;
    private int organizingCulturalEvents;
    private int participationInCulturalEvents;

    public BriefApprisal() {}

    public BriefApprisal(int empId, int selfEvaluation, int reportingAndAnalysis, int goalManagement, int learningAndDevelopment, int deployment, int configurability, int integration, int communication, int friendlinessToPeers, int approchable, int teamPlayer, int abilityToTakeLead, int contributionToProject, int onTimeDeliveryOfProject, int clientFeedback, int organizingCulturalEvents, int participationInCulturalEvents) {
        this.empId = empId;
        this.selfEvaluation = selfEvaluation;
        this.reportingAndAnalysis = reportingAndAnalysis;
        this.goalManagement = goalManagement;
        this.learningAndDevelopment = learningAndDevelopment;
        this.deployment = deployment;
        this.configurability = configurability;
        this.integration = integration;
        this.communication = communication;
        this.friendlinessToPeers = friendlinessToPeers;
        this.approchable = approchable;
        this.teamPlayer = teamPlayer;
        this.abilityToTakeLead = abilityToTakeLead;
        this.contributionToProject = contributionToProject;
        this.onTimeDeliveryOfProject = onTimeDeliveryOfProject;
        this.clientFeedback = clientFeedback;
        this.organizingCulturalEvents = organizingCulturalEvents;
        this.participationInCulturalEvents = participationInCulturalEvents;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getSelfEvaluation() {
        return selfEvaluation;
    }

    public void setSelfEvaluation(int selfEvaluation) {
        this.selfEvaluation = selfEvaluation;
    }

    public int getReportingAndAnalysis() {
        return reportingAndAnalysis;
    }

    public void setReportingAndAnalysis(int reportingAndAnalysis) {
        this.reportingAndAnalysis = reportingAndAnalysis;
    }

    public int getGoalManagement() {
        return goalManagement;
    }

    public void setGoalManagement(int goalManagement) {
        this.goalManagement = goalManagement;
    }

    public int getLearningAndDevelopment() {
        return learningAndDevelopment;
    }

    public void setLearningAndDevelopment(int learningAndDevelopment) {
        this.learningAndDevelopment = learningAndDevelopment;
    }

    public int getDeployment() {
        return deployment;
    }

    public void setDeployment(int deployment) {
        this.deployment = deployment;
    }

    public int getConfigurability() {
        return configurability;
    }

    public void setConfigurability(int configurability) {
        this.configurability = configurability;
    }

    public int getIntegration() {
        return integration;
    }

    public void setIntegration(int integration) {
        this.integration = integration;
    }

    public int getCommunication() {
        return communication;
    }

    public void setCommunication(int communication) {
        this.communication = communication;
    }

    public int getFriendlinessToPeers() {
        return friendlinessToPeers;
    }

    public void setFriendlinessToPeers(int friendlinessToPeers) {
        this.friendlinessToPeers = friendlinessToPeers;
    }

    public int getApprochable() {
        return approchable;
    }

    public void setApprochable(int approchable) {
        this.approchable = approchable;
    }

    public int getTeamPlayer() {
        return teamPlayer;
    }

    public void setTeamPlayer(int teamPlayer) {
        this.teamPlayer = teamPlayer;
    }

    public int getAbilityToTakeLead() {
        return abilityToTakeLead;
    }

    public void setAbilityToTakeLead(int abilityToTakeLead) {
        this.abilityToTakeLead = abilityToTakeLead;
    }

    public int getContributionToProject() {
        return contributionToProject;
    }

    public void setContributionToProject(int contributionToProject) {
        this.contributionToProject = contributionToProject;
    }

    public int getOnTimeDeliveryOfProject() {
        return onTimeDeliveryOfProject;
    }

    public void setOnTimeDeliveryOfProject(int onTimeDeliveryOfProject) {
        this.onTimeDeliveryOfProject = onTimeDeliveryOfProject;
    }

    public int getClientFeedback() {
        return clientFeedback;
    }

    public void setClientFeedback(int clientFeedback) {
        this.clientFeedback = clientFeedback;
    }

    public int getOrganizingCulturalEvents() {
        return organizingCulturalEvents;
    }

    public void setOrganizingCulturalEvents(int organizingCulturalEvents) {
        this.organizingCulturalEvents = organizingCulturalEvents;
    }

    public int getParticipationInCulturalEvents() {
        return participationInCulturalEvents;
    }

    public void setParticipationInCulturalEvents(int participationInCulturalEvents) {
        this.participationInCulturalEvents = participationInCulturalEvents;
    }


    @Override
    public String toString() {
        return "BriefApprisal{" +
                "id=" + id +
                ", empId=" + empId +
                ", selfEvaluation=" + selfEvaluation +
                ", reportingAndAnalysis=" + reportingAndAnalysis +
                ", goalManagement=" + goalManagement +
                ", learningAndDevelopment=" + learningAndDevelopment +
                ", deployment=" + deployment +
                ", configurability=" + configurability +
                ", integration=" + integration +
                ", communication=" + communication +
                ", friendlinessToPeers=" + friendlinessToPeers +
                ", approchable=" + approchable +
                ", teamPlayer=" + teamPlayer +
                ", abilityToTakeLead=" + abilityToTakeLead +
                ", contributionToProject=" + contributionToProject +
                ", onTimeDeliveryOfProject=" + onTimeDeliveryOfProject +
                ", clientFeedback=" + clientFeedback +
                ", organizingCulturalEvents=" + organizingCulturalEvents +
                ", participationInCulturalEvents=" + participationInCulturalEvents +
                '}';
    }
}
