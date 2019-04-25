package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CreativeWork
    extends OntologyDef(
      iri = "http://schema.org/CreativeWork",
      iris = Set("http://schema.org/CreativeWork"),
      label = "CreativeWork",
      comment =
        """The most generic kind of creative work, including books, movies, photographs, software programs, etc.""",
      `@extends` = () => List(Thing.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Thing.Properties {
    lazy val sourceOrganization   = lspace.ns.vocab.schema.sourceOrganization.property
    lazy val thumbnailUrl         = lspace.ns.vocab.schema.thumbnailUrl.property
    lazy val inLanguage           = lspace.ns.vocab.schema.inLanguage.property
    lazy val comment              = lspace.ns.vocab.schema.comment.property
    lazy val contentLocation      = lspace.ns.vocab.schema.contentLocation.property
    lazy val editor               = lspace.ns.vocab.schema.editor.property
    lazy val publishingPrinciples = lspace.ns.vocab.schema.publishingPrinciples.property
    lazy val isPartOf             = lspace.ns.vocab.schema.isPartOf.property
    lazy val position             = lspace.ns.vocab.schema.position.property
    lazy val workTranslation      = lspace.ns.vocab.schema.workTranslation.property
    lazy val encodingFormat       = lspace.ns.vocab.schema.encodingFormat.property
    lazy val aggregateRating      = lspace.ns.vocab.schema.aggregateRating.property
    lazy val accessibilityControl = lspace.ns.vocab.schema.accessibilityControl.property
    lazy val schemaVersion        = lspace.ns.vocab.schema.schemaVersion.property
    lazy val educationalUse       = lspace.ns.vocab.schema.educationalUse.property
    lazy val isFamilyFriendly     = lspace.ns.vocab.schema.isFamilyFriendly.property
    lazy val temporalCoverage     = lspace.ns.vocab.schema.temporalCoverage.property
    lazy val genre                = lspace.ns.vocab.schema.genre.property
    lazy val encodings            = lspace.ns.vocab.schema.encodings.property
    lazy val accessibilityAPI     = lspace.ns.vocab.schema.accessibilityAPI.property
    lazy val expires              = lspace.ns.vocab.schema.expires.property
    lazy val typicalAgeRange      = lspace.ns.vocab.schema.typicalAgeRange.property
    lazy val fileFormat           = lspace.ns.vocab.schema.fileFormat.property
    lazy val citation             = lspace.ns.vocab.schema.citation.property
    lazy val sdLicense            = lspace.ns.vocab.schema.sdLicense.property
    lazy val offers               = lspace.ns.vocab.schema.offers.property
    lazy val accessibilityHazard  = lspace.ns.vocab.schema.accessibilityHazard.property
    lazy val publisherImprint     = lspace.ns.vocab.schema.publisherImprint.property
    lazy val character            = lspace.ns.vocab.schema.character.property
    lazy val locationCreated      = lspace.ns.vocab.schema.locationCreated.property
    lazy val accessibilitySummary = lspace.ns.vocab.schema.accessibilitySummary.property
    lazy val copyrightYear        = lspace.ns.vocab.schema.copyrightYear.property
    lazy val exampleOfWork        = lspace.ns.vocab.schema.exampleOfWork.property
    lazy val discussionUrl        = lspace.ns.vocab.schema.discussionUrl.property
    lazy val keywords             = lspace.ns.vocab.schema.keywords.property
    lazy val license              = lspace.ns.vocab.schema.license.property
    lazy val associatedMedia      = lspace.ns.vocab.schema.associatedMedia.property
    lazy val mentions             = lspace.ns.vocab.schema.mentions.property
    lazy val version              = lspace.ns.vocab.schema.version.property
    lazy val provider             = lspace.ns.vocab.schema.provider.property
    lazy val translator           = lspace.ns.vocab.schema.translator.property
    lazy val sdDatePublished      = lspace.ns.vocab.schema.sdDatePublished.property
    lazy val workExample          = lspace.ns.vocab.schema.workExample.property
    lazy val creator              = lspace.ns.vocab.schema.creator.property
    lazy val awards               = lspace.ns.vocab.schema.awards.property
    lazy val commentCount         = lspace.ns.vocab.schema.commentCount.property
    lazy val award                = lspace.ns.vocab.schema.award.property
    lazy val author               = lspace.ns.vocab.schema.author.property
    lazy val interactivityType    = lspace.ns.vocab.schema.interactivityType.property
    lazy val material             = lspace.ns.vocab.schema.material.property
    lazy val mainEntity           = lspace.ns.vocab.schema.mainEntity.property
    lazy val video                = lspace.ns.vocab.schema.video.property
    lazy val recordedAt           = lspace.ns.vocab.schema.recordedAt.property
    lazy val sdPublisher          = lspace.ns.vocab.schema.sdPublisher.property
    lazy val accountablePerson    = lspace.ns.vocab.schema.accountablePerson.property
    lazy val reviews              = lspace.ns.vocab.schema.reviews.property
    lazy val dateCreated          = lspace.ns.vocab.schema.dateCreated.property
    lazy val isBasedOn            = lspace.ns.vocab.schema.isBasedOn.property
    lazy val audience             = lspace.ns.vocab.schema.audience.property
    lazy val dateModified         = lspace.ns.vocab.schema.dateModified.property
    lazy val producer             = lspace.ns.vocab.schema.producer.property
    lazy val text                 = lspace.ns.vocab.schema.text.property
    lazy val spatial              = lspace.ns.vocab.schema.spatial.property
    lazy val headline             = lspace.ns.vocab.schema.headline.property
    lazy val translationOfWork    = lspace.ns.vocab.schema.translationOfWork.property
    lazy val releasedEvent        = lspace.ns.vocab.schema.releasedEvent.property
    lazy val hasPart              = lspace.ns.vocab.schema.hasPart.property
    lazy val accessModeSufficient = lspace.ns.vocab.schema.accessModeSufficient.property
    lazy val contentReferenceTime = lspace.ns.vocab.schema.contentReferenceTime.property
    lazy val contentRating        = lspace.ns.vocab.schema.contentRating.property
    lazy val publisher            = lspace.ns.vocab.schema.publisher.property
    lazy val review               = lspace.ns.vocab.schema.review.property
    lazy val isBasedOnUrl         = lspace.ns.vocab.schema.isBasedOnUrl.property
    lazy val materialExtent       = lspace.ns.vocab.schema.materialExtent.property
    lazy val learningResourceType = lspace.ns.vocab.schema.learningResourceType.property
    lazy val correction           = lspace.ns.vocab.schema.correction.property
    lazy val spatialCoverage      = lspace.ns.vocab.schema.spatialCoverage.property
    lazy val audio                = lspace.ns.vocab.schema.audio.property
    lazy val contributor          = lspace.ns.vocab.schema.contributor.property
    lazy val copyrightHolder      = lspace.ns.vocab.schema.copyrightHolder.property
    lazy val datePublished        = lspace.ns.vocab.schema.datePublished.property
    lazy val accessMode           = lspace.ns.vocab.schema.accessMode.property
    lazy val isAccessibleForFree  = lspace.ns.vocab.schema.isAccessibleForFree.property
    lazy val funder               = lspace.ns.vocab.schema.funder.property
    lazy val interactionStatistic = lspace.ns.vocab.schema.interactionStatistic.property
    lazy val encoding             = lspace.ns.vocab.schema.encoding.property
    lazy val sponsor              = lspace.ns.vocab.schema.sponsor.property
    lazy val timeRequired         = lspace.ns.vocab.schema.timeRequired.property
    lazy val publication          = lspace.ns.vocab.schema.publication.property
    lazy val accessibilityFeature = lspace.ns.vocab.schema.accessibilityFeature.property
    lazy val temporal             = lspace.ns.vocab.schema.temporal.property
    lazy val alternativeHeadline  = lspace.ns.vocab.schema.alternativeHeadline.property
  }
  override lazy val properties: List[LProperty] = List(
    sourceOrganization,
    thumbnailUrl,
    inLanguage,
    comment,
    contentLocation,
    editor,
    publishingPrinciples,
    isPartOf,
    position,
    workTranslation,
    encodingFormat,
    aggregateRating,
    accessibilityControl,
    schemaVersion,
    educationalUse,
    isFamilyFriendly,
    temporalCoverage,
    genre,
    encodings,
    accessibilityAPI,
    expires,
    typicalAgeRange,
    fileFormat,
    citation,
    sdLicense,
    offers,
    accessibilityHazard,
    publisherImprint,
    character,
    locationCreated,
    accessibilitySummary,
    copyrightYear,
    exampleOfWork,
    discussionUrl,
    keywords,
    license,
    associatedMedia,
    mentions,
    version,
    provider,
    translator,
    sdDatePublished,
    workExample,
    creator,
    awards,
    commentCount,
    award,
    author,
    interactivityType,
    material,
    mainEntity,
    video,
    recordedAt,
    sdPublisher,
    accountablePerson,
    reviews,
    dateCreated,
    isBasedOn,
    audience,
    dateModified,
    producer,
    text,
    spatial,
    headline,
    translationOfWork,
    releasedEvent,
    hasPart,
    accessModeSufficient,
    contentReferenceTime,
    contentRating,
    publisher,
    review,
    isBasedOnUrl,
    materialExtent,
    learningResourceType,
    correction,
    spatialCoverage,
    audio,
    contributor,
    copyrightHolder,
    datePublished,
    accessMode,
    isAccessibleForFree,
    funder,
    interactionStatistic,
    encoding,
    sponsor,
    timeRequired,
    publication,
    accessibilityFeature,
    temporal,
    alternativeHeadline
  )
  trait Properties extends lspace.ns.vocab.schema.Thing.Properties {
    lazy val sourceOrganization   = lspace.ns.vocab.schema.sourceOrganization.property
    lazy val thumbnailUrl         = lspace.ns.vocab.schema.thumbnailUrl.property
    lazy val inLanguage           = lspace.ns.vocab.schema.inLanguage.property
    lazy val comment              = lspace.ns.vocab.schema.comment.property
    lazy val contentLocation      = lspace.ns.vocab.schema.contentLocation.property
    lazy val editor               = lspace.ns.vocab.schema.editor.property
    lazy val publishingPrinciples = lspace.ns.vocab.schema.publishingPrinciples.property
    lazy val isPartOf             = lspace.ns.vocab.schema.isPartOf.property
    lazy val position             = lspace.ns.vocab.schema.position.property
    lazy val workTranslation      = lspace.ns.vocab.schema.workTranslation.property
    lazy val encodingFormat       = lspace.ns.vocab.schema.encodingFormat.property
    lazy val aggregateRating      = lspace.ns.vocab.schema.aggregateRating.property
    lazy val accessibilityControl = lspace.ns.vocab.schema.accessibilityControl.property
    lazy val schemaVersion        = lspace.ns.vocab.schema.schemaVersion.property
    lazy val educationalUse       = lspace.ns.vocab.schema.educationalUse.property
    lazy val isFamilyFriendly     = lspace.ns.vocab.schema.isFamilyFriendly.property
    lazy val temporalCoverage     = lspace.ns.vocab.schema.temporalCoverage.property
    lazy val genre                = lspace.ns.vocab.schema.genre.property
    lazy val encodings            = lspace.ns.vocab.schema.encodings.property
    lazy val accessibilityAPI     = lspace.ns.vocab.schema.accessibilityAPI.property
    lazy val expires              = lspace.ns.vocab.schema.expires.property
    lazy val typicalAgeRange      = lspace.ns.vocab.schema.typicalAgeRange.property
    lazy val fileFormat           = lspace.ns.vocab.schema.fileFormat.property
    lazy val citation             = lspace.ns.vocab.schema.citation.property
    lazy val sdLicense            = lspace.ns.vocab.schema.sdLicense.property
    lazy val offers               = lspace.ns.vocab.schema.offers.property
    lazy val accessibilityHazard  = lspace.ns.vocab.schema.accessibilityHazard.property
    lazy val publisherImprint     = lspace.ns.vocab.schema.publisherImprint.property
    lazy val character            = lspace.ns.vocab.schema.character.property
    lazy val locationCreated      = lspace.ns.vocab.schema.locationCreated.property
    lazy val accessibilitySummary = lspace.ns.vocab.schema.accessibilitySummary.property
    lazy val copyrightYear        = lspace.ns.vocab.schema.copyrightYear.property
    lazy val exampleOfWork        = lspace.ns.vocab.schema.exampleOfWork.property
    lazy val discussionUrl        = lspace.ns.vocab.schema.discussionUrl.property
    lazy val keywords             = lspace.ns.vocab.schema.keywords.property
    lazy val license              = lspace.ns.vocab.schema.license.property
    lazy val associatedMedia      = lspace.ns.vocab.schema.associatedMedia.property
    lazy val mentions             = lspace.ns.vocab.schema.mentions.property
    lazy val version              = lspace.ns.vocab.schema.version.property
    lazy val provider             = lspace.ns.vocab.schema.provider.property
    lazy val translator           = lspace.ns.vocab.schema.translator.property
    lazy val sdDatePublished      = lspace.ns.vocab.schema.sdDatePublished.property
    lazy val workExample          = lspace.ns.vocab.schema.workExample.property
    lazy val creator              = lspace.ns.vocab.schema.creator.property
    lazy val awards               = lspace.ns.vocab.schema.awards.property
    lazy val commentCount         = lspace.ns.vocab.schema.commentCount.property
    lazy val award                = lspace.ns.vocab.schema.award.property
    lazy val author               = lspace.ns.vocab.schema.author.property
    lazy val interactivityType    = lspace.ns.vocab.schema.interactivityType.property
    lazy val material             = lspace.ns.vocab.schema.material.property
    lazy val mainEntity           = lspace.ns.vocab.schema.mainEntity.property
    lazy val video                = lspace.ns.vocab.schema.video.property
    lazy val recordedAt           = lspace.ns.vocab.schema.recordedAt.property
    lazy val sdPublisher          = lspace.ns.vocab.schema.sdPublisher.property
    lazy val accountablePerson    = lspace.ns.vocab.schema.accountablePerson.property
    lazy val reviews              = lspace.ns.vocab.schema.reviews.property
    lazy val dateCreated          = lspace.ns.vocab.schema.dateCreated.property
    lazy val isBasedOn            = lspace.ns.vocab.schema.isBasedOn.property
    lazy val audience             = lspace.ns.vocab.schema.audience.property
    lazy val dateModified         = lspace.ns.vocab.schema.dateModified.property
    lazy val producer             = lspace.ns.vocab.schema.producer.property
    lazy val text                 = lspace.ns.vocab.schema.text.property
    lazy val spatial              = lspace.ns.vocab.schema.spatial.property
    lazy val headline             = lspace.ns.vocab.schema.headline.property
    lazy val translationOfWork    = lspace.ns.vocab.schema.translationOfWork.property
    lazy val releasedEvent        = lspace.ns.vocab.schema.releasedEvent.property
    lazy val hasPart              = lspace.ns.vocab.schema.hasPart.property
    lazy val accessModeSufficient = lspace.ns.vocab.schema.accessModeSufficient.property
    lazy val contentReferenceTime = lspace.ns.vocab.schema.contentReferenceTime.property
    lazy val contentRating        = lspace.ns.vocab.schema.contentRating.property
    lazy val publisher            = lspace.ns.vocab.schema.publisher.property
    lazy val review               = lspace.ns.vocab.schema.review.property
    lazy val isBasedOnUrl         = lspace.ns.vocab.schema.isBasedOnUrl.property
    lazy val materialExtent       = lspace.ns.vocab.schema.materialExtent.property
    lazy val learningResourceType = lspace.ns.vocab.schema.learningResourceType.property
    lazy val correction           = lspace.ns.vocab.schema.correction.property
    lazy val spatialCoverage      = lspace.ns.vocab.schema.spatialCoverage.property
    lazy val audio                = lspace.ns.vocab.schema.audio.property
    lazy val contributor          = lspace.ns.vocab.schema.contributor.property
    lazy val copyrightHolder      = lspace.ns.vocab.schema.copyrightHolder.property
    lazy val datePublished        = lspace.ns.vocab.schema.datePublished.property
    lazy val accessMode           = lspace.ns.vocab.schema.accessMode.property
    lazy val isAccessibleForFree  = lspace.ns.vocab.schema.isAccessibleForFree.property
    lazy val funder               = lspace.ns.vocab.schema.funder.property
    lazy val interactionStatistic = lspace.ns.vocab.schema.interactionStatistic.property
    lazy val encoding             = lspace.ns.vocab.schema.encoding.property
    lazy val sponsor              = lspace.ns.vocab.schema.sponsor.property
    lazy val timeRequired         = lspace.ns.vocab.schema.timeRequired.property
    lazy val publication          = lspace.ns.vocab.schema.publication.property
    lazy val accessibilityFeature = lspace.ns.vocab.schema.accessibilityFeature.property
    lazy val temporal             = lspace.ns.vocab.schema.temporal.property
    lazy val alternativeHeadline  = lspace.ns.vocab.schema.alternativeHeadline.property
  }
}
