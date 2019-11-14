# ERB Templates

require 'sinatra'

get '/' do
    'Hello, World!'
end

get '/year' do
    template = 'The year is <%= Time.now.year %>'
    erb template, :layout => false
end

get '/date' do
    erb :date, :layout => false
end

get '/list' do
    erb :list, :layout => false
end

get '/color' do
    @page_title = 'Color'
    @red = params[:red]
    @green = params[:green]
    @blue = params[:blue]
    erb "color/color".to_sym, :layout => false
end

get '/my_page' do 
    @page_title = 'My Page'
    erb :_my_page
end
