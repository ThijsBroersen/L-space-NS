package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MediaObject extends OntologyDef(
        iri = "http://schema.org/MediaObject",
        iris = Set("http://schema.org/MediaObject"),
        label = "MediaObject",
        comment = """A media object, such as an image, video, or audio object embedded in a web page or a downloadable dataset i.e. DataDownload. Note that a creative work may have many media objects associated with it on the same web page. For example, a page about a single song (MusicRecording) may have a music video (VideoObject), and a high and low bandwidth audio stream (2 AudioObject's).""",
        `@extends` = List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val associatedArticle = lspace.ns.vocab.schema.associatedArticle.property
lazy val bitrate = lspace.ns.vocab.schema.bitrate.property
lazy val contentSize = lspace.ns.vocab.schema.contentSize.property
lazy val contentUrl = lspace.ns.vocab.schema.contentUrl.property
lazy val duration = lspace.ns.vocab.schema.duration.property
lazy val embedUrl = lspace.ns.vocab.schema.embedUrl.property
lazy val encodesCreativeWork = lspace.ns.vocab.schema.encodesCreativeWork.property
lazy val endTime = lspace.ns.vocab.schema.endTime.property
lazy val height = lspace.ns.vocab.schema.height.property
lazy val playerType = lspace.ns.vocab.schema.playerType.property
lazy val productionCompany = lspace.ns.vocab.schema.productionCompany.property
lazy val regionsAllowed = lspace.ns.vocab.schema.regionsAllowed.property
lazy val requiresSubscription = lspace.ns.vocab.schema.requiresSubscription.property
lazy val startTime = lspace.ns.vocab.schema.startTime.property
lazy val uploadDate = lspace.ns.vocab.schema.uploadDate.property
lazy val width = lspace.ns.vocab.schema.width.property
}
override lazy val properties: List[LProperty] = List(associatedArticle, bitrate, contentSize, contentUrl, duration, embedUrl, encodesCreativeWork, endTime, height, playerType, productionCompany, regionsAllowed, requiresSubscription, startTime, uploadDate, width)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val associatedArticle = lspace.ns.vocab.schema.associatedArticle.property
lazy val bitrate = lspace.ns.vocab.schema.bitrate.property
lazy val contentSize = lspace.ns.vocab.schema.contentSize.property
lazy val contentUrl = lspace.ns.vocab.schema.contentUrl.property
lazy val duration = lspace.ns.vocab.schema.duration.property
lazy val embedUrl = lspace.ns.vocab.schema.embedUrl.property
lazy val encodesCreativeWork = lspace.ns.vocab.schema.encodesCreativeWork.property
lazy val endTime = lspace.ns.vocab.schema.endTime.property
lazy val height = lspace.ns.vocab.schema.height.property
lazy val playerType = lspace.ns.vocab.schema.playerType.property
lazy val productionCompany = lspace.ns.vocab.schema.productionCompany.property
lazy val regionsAllowed = lspace.ns.vocab.schema.regionsAllowed.property
lazy val requiresSubscription = lspace.ns.vocab.schema.requiresSubscription.property
lazy val startTime = lspace.ns.vocab.schema.startTime.property
lazy val uploadDate = lspace.ns.vocab.schema.uploadDate.property
lazy val width = lspace.ns.vocab.schema.width.property
}
}