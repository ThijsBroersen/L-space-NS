package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AskAction extends OntologyDef(
        iri = "http://schema.org/AskAction",
        iris = Set("http://schema.org/AskAction"),
        label = "AskAction",
        comment = """The act of posing a question / favor to someone.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/ReplyAction">ReplyAction</a>: Appears generally as a response to AskAction.</li>
</ul>
""",
        `@extends` = List(CommunicateAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CommunicateAction.Properties{
lazy val question = lspace.ns.vocab.schema.question.property
}
override lazy val properties: List[LProperty] = List(question)
trait Properties extends lspace.ns.vocab.schema.CommunicateAction.Properties{
lazy val question = lspace.ns.vocab.schema.question.property
}
}