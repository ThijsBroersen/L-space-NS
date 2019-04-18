package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MusicComposition
    extends OntologyDef(
      iri = "http://schema.org/MusicComposition",
      iris = Set("http://schema.org/MusicComposition"),
      label = "MusicComposition",
      comment = """A musical composition.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val iswcCode         = lspace.ns.vocab.schema.iswcCode.property
    lazy val composer         = lspace.ns.vocab.schema.composer.property
    lazy val recordedAs       = lspace.ns.vocab.schema.recordedAs.property
    lazy val lyrics           = lspace.ns.vocab.schema.lyrics.property
    lazy val musicArrangement = lspace.ns.vocab.schema.musicArrangement.property
    lazy val firstPerformance = lspace.ns.vocab.schema.firstPerformance.property
    lazy val musicalKey       = lspace.ns.vocab.schema.musicalKey.property
  }
  override lazy val properties: List[Property] =
    List(iswcCode, composer, recordedAs, lyrics, musicArrangement, firstPerformance, musicalKey)
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val iswcCode         = lspace.ns.vocab.schema.iswcCode.property
    lazy val composer         = lspace.ns.vocab.schema.composer.property
    lazy val recordedAs       = lspace.ns.vocab.schema.recordedAs.property
    lazy val lyrics           = lspace.ns.vocab.schema.lyrics.property
    lazy val musicArrangement = lspace.ns.vocab.schema.musicArrangement.property
    lazy val firstPerformance = lspace.ns.vocab.schema.firstPerformance.property
    lazy val musicalKey       = lspace.ns.vocab.schema.musicalKey.property
  }
}
